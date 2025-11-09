package org.apache.tika.extractor;

import java.io.IOException;
import java.io.Serializable;
import org.apache.tika.exception.TikaException;
import org.apache.tika.p015io.TikaInputStream;

/* loaded from: classes3.dex */
public interface ContainerExtractor extends Serializable {
    void extract(TikaInputStream tikaInputStream, ContainerExtractor containerExtractor, EmbeddedResourceHandler embeddedResourceHandler) throws TikaException, IOException;

    boolean isSupported(TikaInputStream tikaInputStream) throws IOException;
}
