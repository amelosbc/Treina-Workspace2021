import { useEffect, useState } from 'react';
import { fetchProducts } from '../api';
import ProductList from './Product.list';
import StepsHeader from './StepsHeader';
import './styles.css';
import ProductStruct from './types';


function Orders(){

    const [products, setProducts] = useState<ProductStruct[]>([]);

    useEffect(() => {
        fetchProducts()
        .then(response => setProducts(response.data))
        .catch(error => console.log(error))

    }, []);

    return (
    <div className="orders-container">
        <StepsHeader />
        <ProductList products={products}/>
    </div>

    )
}

export default Orders;