import { ReactComponent as GithubIcon } from 'assets/img/github.svg';
import './styles.css';

function Navbar() {


    return (
        <header>
            <nav className="container">
                <div className="dsmovie-nav-content">
                    <h1>DSmovie</h1>
                    <a href="https://github.com/alanvitor377"></a>
                    <div className="dsmovie-contact-container">
                        <GithubIcon />
                        <p className="dsmovie-contact-link">/devsuperior</p>
                    </div>
                </div>
            </nav>
        </header>

    );

}

export default Navbar;