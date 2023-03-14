import '../style/StepCounter.css'
import React, { useState, useEffect } from 'react';

const StepCounter = () => {
    const [stepCount, setStepCount] = useState(0);
    const [unit, setUnit] = useState('pas');
    const [valueToAdd, setValueToAdd] = useState(0);
    const [villes, setVilles] = useState([]);
    const [currentCity, setCurrentCity] = useState(null);


    useEffect(() => {
        // Récupère la valeur actuelle du compteur de pas à partir de l'API REST
        fetch('http://localhost:8080/api/counter')
            .then(response => response.json())
            .then(data => setStepCount(data.valeur))
            .catch(error => console.error(error));
    }, []);

    useEffect(() => {
        // Récupère la liste des villes à partir de l'API REST
        fetch('http://localhost:8080/api/city')
            .then((response) => response.json())
            .then((data) => {
                console.log(data.cities);
                setVilles(data.cities);
                setCurrentCity(data.cities[0]);
            });
    }, []);

    useEffect(() => {
        if (currentCity && stepCount >= currentCity.distanceFrom0) {
            const nextCity = villes.find(city => city.distanceFrom0 > stepCount);
            setCurrentCity(nextCity);
        }
    }, [stepCount, villes, currentCity]);

    const handleSave = () => {
        if (stepCount === undefined) {
            //console.log('Erreur: stepCount est indéfini');
            return;
        }
        let url = 'http://localhost:8080/api/counter/steps';
        if (unit === 'kilomètre') {
            url = 'http://localhost:8080/api/counter/km';
        }
        //console.log('Valeur ajoutée : ', valueToAdd);
        //console.log('Valeur actuelle de stepCount :', stepCount);
        //console.log('Unité : ', unit);
        //console.log('url : ', url);

        const counterToUpdate = { value: valueToAdd };
        // Enregistre les modifications apportées au compteur de pas ou de km dans l'API REST
        fetch(url, {
            method: 'PUT',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify(counterToUpdate)
        })
            .then(response => response.json())
            .then(data => setStepCount(data.valeur))
            .catch(error => console.error(error));
    };

    const getPercentage = () => {
        if (!currentCity) {
            return 0;
        }
        const percentage = (stepCount / currentCity.distanceFrom0) * 100;
        return percentage > 100 ? 100 : percentage;
    };


    return (
        <div className='step-counter'>
            <p>Nombre de kilomètres : <span>{stepCount}</span></p>
            {currentCity && (
                <div key={currentCity.id}>
                    <p>Progression jusqu'à {currentCity.nom}</p>
                    <div className="progress-bar">
                        <div className="progress-bar-fill" style={{ width: `${getPercentage(currentCity)}%` }}></div>
                    </div>
                </div>
            )}
            <input type="number" value={valueToAdd} onChange={e => setValueToAdd(e.target.value)} />
            <select value={unit} onChange={e => setUnit(e.target.value)}>
                <option value="pas">Pas</option>
                <option value="kilomètre">Kilomètres</option>
            </select>
            <button onClick={handleSave}>Enregistrer</button>
        </div>
    );
};

export default StepCounter;
