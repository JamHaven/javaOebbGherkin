package fh.campuswien.javaOebbGherkin;
import io.cucumber.gherkin.Gherkin;
import io.cucumber.messages.IdGenerator;
import io.cucumber.messages.Messages;
import io.cucumber.messages.Messages.Envelope;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Collections.singletonList;

public class GherkinParser {

     List parseFeatureFile(String file){
        IdGenerator idGenerator = new IdGenerator.Incrementing();
        List<String> paths = singletonList(file);
        boolean includeSource = false;
        boolean includeAst = true;
        boolean includePickles = true;
        Stream<Envelope> envelopeStream = Gherkin.fromPaths(paths, includeSource, includeAst, includePickles, idGenerator);;
        Stream<Envelope> pickleStream = envelopeStream.filter(Messages.Envelope::hasPickle);

       // return envelopeStream.collect(Collectors.toList());
         return pickleStream.collect(Collectors.toList());
    }
}
