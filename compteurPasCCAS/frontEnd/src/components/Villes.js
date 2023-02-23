import '../style/Villes.css'

function Villes() {
	const parisKm = 8
	const londresKm = 10
	const athenesKM = 15
	
	return (
		<div className='lmj-villes'>
			<h2>Les villes hôtes</h2>
			<ul>
				<li>Paris : {parisKm}km</li>
				<li>Londres : {londresKm}km</li>
				<li>Athènes : {athenesKM}km</li>
			</ul>
			Total : {parisKm + londresKm + athenesKM}km
		</div>
	)
}

export default Villes