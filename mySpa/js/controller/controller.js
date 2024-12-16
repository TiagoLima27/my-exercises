import service from '../service/service.js';
import view from '../view/view.js';

export async function init() {
    const { quote, author } = await service.fetchRandomQuote(); 
    view.render(quote, author); 
}
