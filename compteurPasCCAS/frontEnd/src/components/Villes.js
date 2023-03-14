import { useEffect, useState } from 'react';
import '../style/Villes.css'

function Villes() {
	const [villes, setVilles] = useState([]);

	useEffect(() => {
		// Récupère la liste des villes à partir de l'API REST
		fetch('http://localhost:8080/api/city')
			.then((response) => response.json())
			.then((data) => {
				console.log(data.cities);
				setVilles(data.cities);
			});
	}, []);

	const [StepCount, setStepCount] = useState(0);

	useEffect(() => {
		// Récupère la valeur actuelle du compteur de pas à partir de l'API REST
		fetch('http://localhost:8080/api/counter')
			.then(response => response.json())
			.then(data => setStepCount(data.valeur))
			.catch(error => console.error(error));
	}, []);

	const [distanceFrom0, setDistance] = useState(0);

	const estVerrouillee = (id) => {
		fetch(`http://localhost:8080/api/city/distanceFrom0/${id}`)
			.then(response => response.json())
			.then(data => setDistance(data.distanceFrom0))
			.catch(error => console.error(error));

		const ville = villes.find(v => v.id === id);
		return StepCount >= ville.distanceFrom0;
	};


	const [infosVilles, setInfosVilles] = useState(Array(villes.length).fill(''));

	const afficherInfos = (id) => {
		// Affiche les informations des villes
		if (estVerrouillee(id)) {
			//Réécupère les informations des villes
			fetch(`http://localhost:8080/api/city/info/${id}`)
				.then((response) => response.json())
				.then(data => {
					const index = villes.findIndex(v => v.id === id);
					const newInfosVilles = [...infosVilles];
					if (newInfosVilles[index] === data.informations) {
						// Supprime l'information si elle est déjà affichée
						newInfosVilles[index] = '';
					} else {
						newInfosVilles[index] = data.informations;
					}
					setInfosVilles(newInfosVilles);
				})
				.catch(error => console.error(error));
		}
	};



	return (
		<div className="villes-list">
			{villes &&
				villes.map((ville) => (
					<div className="ville" key={ville.id}>
						{estVerrouillee(ville.id) && (
							<div className="infos-ville">{infosVilles[villes.findIndex(v => v.id === ville.id)]}</div>
						)}
						<img
							src={ville.urlImg}
							alt={ville.nom}
							className={estVerrouillee(ville.id) ? '' : 'grayscale'}
							onError={(e) => {
								e.target.onerror = null;
								e.target.src = '/default-image.jpg';
							}}
						/>
						<h2>{ville.nom}</h2>
						<button className={estVerrouillee(ville.id) ? '' : 'grayscale'} onClick={() => afficherInfos(ville.id)}>Informations</button>
					</div>
				))
			}
		</div>
	);
}

export default Villes;