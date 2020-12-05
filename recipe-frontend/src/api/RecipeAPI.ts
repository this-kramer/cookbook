import axios, {AxiosInstance, AxiosResponse} from "axios";
import Recipe from "./model/Recipe";

export default class RecipeAPI {
    _axios: AxiosInstance;

    constructor() {
        this._axios = axios.create({
            baseURL: process.env.VUE_APP_API_URL,
            headers: {
                "Accept": "*/*",
                "Content-Type": "application/json;charset=UTF-8",
            },
        });
    }

    async getRecipe(): Promise<Recipe> {
        return await this._axios
            .get<Recipe>('/recipe')
            .then((response: AxiosResponse) => response.data)
    }
}