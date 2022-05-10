import './styles.css';

function Navbar() {
    return (
        <header>
            <nav className="container">
                <div className="dsmovie-nav-content">
                    <h1>DSMovie</h1>
                    <a href="https://github.com/cesar-augusto-alves-barbosa/" target="_blank" rel="noreferrer">
                        <div className="dsmovie-contact-container">
                            <i className="dsmovie-icon-github bi bi-github"></i>
                            <p className="dsmovie-contact-link">/cesar-augusto-alves-barbosa</p>
                        </div>
                    </a>
                </div>
            </nav>
        </header>
    );
}
    
export default Navbar;