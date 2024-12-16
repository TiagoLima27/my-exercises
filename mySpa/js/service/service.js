async function fetchQuote() {
    try {
        const response = await fetch('https://api.kanye.rest');
        const data = await response.json();
        return data.quote;  
    } catch (error) {
        console.error('Error fetching quote:', error);
        return 'Failed to fetch quote.';
    }
}

async function fetchRandomQuote() {
    try {
        const response = await fetch('https://zenquotes.io/api/random');
        const data = await response.json();

        
        if (Array.isArray(data) && data.length > 0) {
            return {
                quote: data[0].q,   
                author: data[0].a   
            };
        } else {
            return { quote: 'No quote found.', author: '' };
        }
    } catch (error) {
        console.error('Error fetching quote:', error);
        return { quote: 'Failed to fetch quote.', author: '' };
    }
}


export default { fetchQuote, fetchRandomQuote };
