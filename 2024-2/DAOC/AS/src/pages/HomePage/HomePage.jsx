import React from 'react';
import Slider from 'react-slick';
import { Link } from 'react-router-dom';
import 'slick-carousel/slick/slick.css'; 
import 'slick-carousel/slick/slick-theme.css';
import './HomePageStyle.css';

function HomePage() {
  const settings = {
    dots: true,
    infinite: true,
    speed: 500,
    slidesToShow: 1,
    slidesToScroll: 1,
  };

  return (
    <div className="homePage">
      <section className="about">
        <h1>Seja Bem-vindo à Tech Store</h1>
        <p>
          A Tech Store é a sua loja online de confiança para encontrar os melhores
          acessórios e equipamentos tecnológicos. Trabalhamos com produtos de alta
          qualidade para gamers, profissionais e entusiastas de tecnologia.
        </p>
        <p>
          Nossa missão é oferecer soluções práticas, inovadoras e acessíveis para
          atender a todas as suas necessidades tecnológicas.
        </p>
      </section>

      <section className="featured-products">
        <h2>Produtos em Destaque</h2>
        <Slider {...settings}>
          <div className="product-card">
            <img src="https://images.tcdn.com.br/img/img_prod/740836/teclado_gamer_pcfort_f2810_single_hand_semi_mecanico_usb_com_rgb_3449_1_a3891de459d4583d00ccdc509c5e1023.jpg" alt="Teclado Gamer" />
            <h3>Teclado Gamer RGB</h3>
            <p>R$ 199,99</p>
            <Link to="/produtos/detalhes/1" className="details-button">Ver Detalhes</Link>
          </div>
          <div className="product-card">
            <img src="https://http2.mlstatic.com/D_NQ_NP_2X_648699-MLU72748500941_112023-F.webp" alt="Mouse Sem Fio" />
            <h3>Mouse Sem Fio</h3>
            <p>R$ 129,99</p>
            <Link to="/produtos/detalhes/2" className="details-button">Ver Detalhes</Link>
          </div>
          <div className="product-card">
            <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSfS_JURpjSmk2GGMTQAFrKXD5voHOt8Ojbkw&s" alt="Webcam Full HD" />
            <h3>Webcam Full HD</h3>
            <p>R$ 299,99</p>
            <Link to="/produtos/detalhes/4" className="details-button">Ver Detalhes</Link>
          </div>
        </Slider>
      </section>
    </div>
  );
}

export default HomePage;
