import axios from "axios";

//const API_URL = process.env.REACT_APP_API_URL;

export function fetchProducts() {
    return axios ('http://localhost:8080/products')
}