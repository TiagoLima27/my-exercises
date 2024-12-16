import homeView from '../view/homeView.js';
import service from '../service/service.js';

export function init() {
    homeView.render(service.fetchQuote);
}
