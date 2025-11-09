package org.apache.tika.pipes;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import o0oOO.OooO0O0;
import o0oOO.OooO0o;
import org.apache.tika.exception.TikaConfigException;
import org.w3c.dom.DOMException;

/* loaded from: classes3.dex */
public class PipesConfig extends PipesConfigBase {
    private static final OooO0O0 LOG = OooO0o.OooO0O0(PipesClient.class);
    private long maxWaitForClientMillis = 60000;

    private PipesConfig() {
    }

    public static PipesConfig load(Path path) throws IOException, TikaConfigException {
        PipesConfig pipesConfig = new PipesConfig();
        InputStream inputStreamNewInputStream = Files.newInputStream(path, new OpenOption[0]);
        try {
            pipesConfig.configure("pipes", inputStreamNewInputStream);
            if (inputStreamNewInputStream != null) {
                inputStreamNewInputStream.close();
            }
            if (pipesConfig.getTikaConfig() == null) {
                LOG.OooOoO(path, "A separate tikaConfig was not specified in the <pipes/> element in the  config file; will use {} for pipes");
                pipesConfig.setTikaConfig(path);
            }
            return pipesConfig;
        } catch (Throwable th) {
            if (inputStreamNewInputStream != null) {
                try {
                    inputStreamNewInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public long getMaxWaitForClientMillis() {
        return this.maxWaitForClientMillis;
    }

    public void setMaxWaitForClientMillis(long j) {
        this.maxWaitForClientMillis = j;
    }

    public static PipesConfig load(InputStream inputStream) throws IllegalAccessException, DOMException, SecurityException, ClassNotFoundException, IOException, TikaConfigException, IllegalArgumentException, InvocationTargetException {
        PipesConfig pipesConfig = new PipesConfig();
        pipesConfig.configure("pipes", inputStream);
        return pipesConfig;
    }
}
