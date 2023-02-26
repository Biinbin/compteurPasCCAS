import { useEffect, useState } from 'react';
import '../style/Villes.css'

function Villes({ distance }) {
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

	const [Distance, setDistance] = useState(0);

	useEffect(() => {
		// Récupère la distance des villes à partir de l'API REST
		fetch('http://localhost:8080/api/counter/distance/${id}')
			.then(response => response.json())
			.then(data => setDistance(data.valeur))
			.catch(error => console.error(error));
	}, []);

	const [infosVille, setInfosVille] = useState('');

	const afficherInfos = (id) => {
		// Affiche les informations des villes
		if (estVerrouillee(id)) {
			//Réécupère les informations des villes
			fetch(`http://localhost:8080/api/city/info/${id}`)
				.then((response) => response.text())
				.then((data) => { setInfosVille(data);
				});
		}
	};

	const estVerrouillee = (id) => {
		const ville = villes.find(v => v.id === id);
		return ville >= ville.distance;
	};

	return (
		<div className="villes-list">
			{villes &&
				villes.map((ville) => (
					<div className="ville" key={ville.id}>
						{estVerrouillee(ville.id) && (
							<div className="infos-ville">{infosVille}</div>
						)}
						<img
							src={ville.urlImg}
							alt={ville.nom}
							onError={(e) => {
								e.target.onerror = null;
								e.target.src = '/default-image.jpg';
							}}
						/>
						<h2>{ville.nom}</h2>
						<button onClick={() => afficherInfos(ville.id)}>Informations</button>
					</div>
				))}
		</div>
	);
}

export default Villes;
