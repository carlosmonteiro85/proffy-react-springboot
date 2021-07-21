import React from 'react';

/* import heroImage from '../assets/img/landing.svg';
import study from '../assets/img/icons/study.svg';
import giveClass from '../assets/img/icons/give-classes.svg';
import coracao from '../assets/img/icons/purple-heart.svg'; */

/* import './src/styles/main.css'; */
/* import './assets/css/partials/page-landing.css'; */

export function Home() {

    return (

        <div id="container">
            <div>
                <img src="" alt="proffy" />
                <h2>Sua plataforma de estudo online</h2>
            </div>

            <img className="hero-image" src="{heroImage}" alt="Plataforma de Estudo" />

            <div className="buttons-container">
                <a className="study" href="">
                    <img src="{study}" alt="Estudar" />
                    Estudar
                </a>

                <a className="give-classes" href="">
                    <img src="{giveClass}" alt="Dar aula" />
                    Dar aulas
                </a>
        
            </div>

           <p className="total-cpnnections">Total de 200 conexões já realizadas
                <img src="{coracao}" alt="Coração Roxo" />
           </p>
        </div>
        

    );
}


