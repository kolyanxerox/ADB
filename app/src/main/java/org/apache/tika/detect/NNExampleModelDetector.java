package org.apache.tika.detect;

import OooO0oO.OooOo;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Objects;
import o0oOO.OooO0O0;
import o0oOO.OooO0o;
import org.apache.tika.mime.MediaType;

/* loaded from: classes3.dex */
public class NNExampleModelDetector extends TrainedModelDetector {
    private static final String EXAMPLE_NNMODEL_FILE = "tika-example.nnmodel";
    private static final OooO0O0 LOG = OooO0o.OooO0O0(NNExampleModelDetector.class);
    private static final long serialVersionUID = 1;

    public NNExampleModelDetector() {
    }

    private void readDescription(NNTrainedModelBuilder nNTrainedModelBuilder, String str) throws NumberFormatException {
        String[] strArrSplit = str.split("\t");
        try {
            MediaType mediaType = MediaType.parse(strArrSplit[1]);
            int i = Integer.parseInt(strArrSplit[2]);
            int i2 = Integer.parseInt(strArrSplit[3]);
            int i3 = Integer.parseInt(strArrSplit[4]);
            nNTrainedModelBuilder.setNumOfInputs(i);
            nNTrainedModelBuilder.setNumOfHidden(i2);
            nNTrainedModelBuilder.setNumOfOutputs(i3);
            nNTrainedModelBuilder.setType(mediaType);
        } catch (Exception e) {
            LOG.OooO("Unable to parse the model configuration", e);
            throw new RuntimeException("Unable to parse the model configuration", e);
        }
    }

    private void readNNParams(NNTrainedModelBuilder nNTrainedModelBuilder, String str) {
        String[] strArrSplit = str.split("\t");
        float[] fArr = new float[strArrSplit.length];
        try {
            int i = 0;
            for (String str2 : strArrSplit) {
                fArr[i] = Float.parseFloat(str2);
                i++;
            }
            nNTrainedModelBuilder.setParams(fArr);
        } catch (Exception e) {
            LOG.OooO("Unable to parse the model configuration", e);
            throw new RuntimeException("Unable to parse the model configuration", e);
        }
    }

    @Override // org.apache.tika.detect.TrainedModelDetector
    public void loadDefaultModels(InputStream inputStream) throws IOException, NumberFormatException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        NNTrainedModelBuilder nNTrainedModelBuilder = new NNTrainedModelBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return;
                }
                String strTrim = line.trim();
                if (strTrim.startsWith("#")) {
                    readDescription(nNTrainedModelBuilder, strTrim);
                } else {
                    readNNParams(nNTrainedModelBuilder, strTrim);
                    super.registerModels(nNTrainedModelBuilder.getType(), nNTrainedModelBuilder.build());
                }
            } catch (IOException e) {
                throw new RuntimeException("Unable to read the default media type registry", e);
            }
        }
    }

    public NNExampleModelDetector(Path path) throws IOException {
        loadDefaultModels(path);
    }

    public NNExampleModelDetector(File file) throws IOException {
        loadDefaultModels(file);
    }

    @Override // org.apache.tika.detect.TrainedModelDetector
    public void loadDefaultModels(ClassLoader classLoader) throws IOException {
        if (classLoader == null) {
            classLoader = TrainedModelDetector.class.getClassLoader();
        }
        String strOooOoo0 = OooOo.OooOoo0(TrainedModelDetector.class.getPackage().getName().replace('.', '/'), "/");
        URL resource = classLoader.getResource(strOooOoo0 + EXAMPLE_NNMODEL_FILE);
        Objects.requireNonNull(resource, "required resource " + strOooOoo0 + "tika-example.nnmodel not found");
        try {
            InputStream inputStreamOpenStream = resource.openStream();
            try {
                loadDefaultModels(inputStreamOpenStream);
                if (inputStreamOpenStream != null) {
                    inputStreamOpenStream.close();
                }
            } finally {
            }
        } catch (IOException e) {
            throw new RuntimeException("Unable to read the default media type registry", e);
        }
    }
}
