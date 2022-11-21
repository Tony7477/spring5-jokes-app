package guru.springframework.spring5jokesappv2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {
    public JokeServiceImpl() {
        this.chuckNorrisQuotes =new  ChuckNorrisQuotes();
    }

    private final ChuckNorrisQuotes chuckNorrisQuotes;
    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
