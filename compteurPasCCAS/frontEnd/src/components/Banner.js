import '../style/Banner.css'
import bandeau from '../assets/bandeau.png'

function Banner() {
    return (
    <div className='lmj-banner'>
        <img src={bandeau} alt='bandeau' className='lmj-bandeau' />
        <h1 id='titre-compt'>COMPTEUR DE PAS</h1>
    </div>)
}

export default Banner