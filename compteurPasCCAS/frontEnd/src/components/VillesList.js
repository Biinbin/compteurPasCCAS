import { ListVilles } from '../datas/ListVilles'

function VillesList() {
	const categories = ListVilles.reduce(
		(acc, villes) =>
			acc.includes(villes.category) ? acc : acc.concat(villes.category),
		[]
	)

	return (
		<div>
			<ul>
				{categories.map((cat) => (
					<li key={cat}>{cat}</li>
				))}
			</ul>
			<ul>
				{ListVilles.map((plant) => (
					<li key={villes.id}>{villes.name}</li>
				))}
			</ul>
		</div>
	)
}

export default VillesList