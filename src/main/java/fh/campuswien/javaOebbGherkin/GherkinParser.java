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

    /**
     * Parses a .feature file in Gherkin format and returns the results
     * @param file Feature file to parse
     * @param pickleStreamWanted If the less detailed pickleStream is wanted, or a more detailed Envelope
     * @return List of the results from the parsed Gherkin file, but not really JSON...?
     */
     List parseFeatureFile(String file, Boolean pickleStreamWanted){
        IdGenerator idGenerator = new IdGenerator.Incrementing();
        List<String> paths = singletonList(file);
        boolean includeSource = false;
        boolean includeAst = true;
        boolean includePickles = true;
        Stream<Envelope> envelopeStream = Gherkin.fromPaths(paths, includeSource, includeAst, includePickles, idGenerator);;

        if(pickleStreamWanted){
            Stream<Envelope> pickleStream = envelopeStream.filter(Messages.Envelope::hasPickle);
            return pickleStream.collect(Collectors.toList());
        }
        else{
            return envelopeStream.collect(Collectors.toList());
        }

    }
}
