import { ReactComponent as Pizza } from './pizza.svg';
import ProductStruct from './types';

type Props = {
    products: ProductStruct;
}

function formatPrice(price: number){
    const formatter = new Intl.NumberFormat('pt-BR', {
        style: 'currency',
        currency: 'BRL',
        minimumFractionDigits: 2
    });

    return formatter.format(price);
}

function ProductCard({products}: Props) {
    return (
        <div className="orders-card-container">
            <h3 className="orders-card-content">
                {products.name}
            </h3>
            <img
                src={products.imageUrl}
                className="order-card-image"
                alt={products.name} 
            />
            <h3 className="order-card-price">
                {formatPrice(products.price)}
            </h3>
            <div className="order-card-description">
                <h3>Descrição</h3>
                <p>
                {products.description}
                </p>

            </div>
        </div>

    )
}

export default ProductCard;