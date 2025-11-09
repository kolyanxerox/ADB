package org.apache.tika.mime;

import OooO0oO.OooOo;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import o0oOO.OooO0O0;
import o0oOO.OooO0o;
import org.w3c.dom.Document;

/* loaded from: classes3.dex */
public class MimeTypesFactory {
    public static final String CUSTOM_MIMES_SYS_PROP = "tika.custom-mimetypes";
    private static final OooO0O0 LOG = OooO0o.OooO0O0(MimeTypesFactory.class);

    public static MimeTypes create() {
        return new MimeTypes();
    }

    public static /* synthetic */ void lambda$create$0(URL url) {
        LOG.OooOoO(url, "Loaded custom mimes file: {}");
    }

    public static MimeTypes create(Document document) throws MimeTypeException {
        MimeTypes mimeTypes = new MimeTypes();
        new MimeTypesReader(mimeTypes).read(document);
        mimeTypes.init();
        return mimeTypes;
    }

    public static MimeTypes create(InputStream... inputStreamArr) throws IOException, MimeTypeException {
        MimeTypes mimeTypes = new MimeTypes();
        MimeTypesReader mimeTypesReader = new MimeTypesReader(mimeTypes);
        for (InputStream inputStream : inputStreamArr) {
            mimeTypesReader.read(inputStream);
        }
        mimeTypes.init();
        return mimeTypes;
    }

    public static MimeTypes create(InputStream inputStream) throws IOException, MimeTypeException {
        return create(inputStream);
    }

    public static MimeTypes create(URL... urlArr) throws IOException, MimeTypeException {
        int length = urlArr.length;
        InputStream[] inputStreamArr = new InputStream[length];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            inputStreamArr[i2] = urlArr[i2].openStream();
        }
        try {
            return create(inputStreamArr);
        } finally {
            while (i < length) {
                inputStreamArr[i].close();
                i++;
            }
        }
    }

    public static MimeTypes create(URL url) throws IOException, MimeTypeException {
        return create(url);
    }

    public static MimeTypes create(String str) throws IOException, MimeTypeException {
        return create(MimeTypesReader.class.getResource(str));
    }

    public static MimeTypes create(String str, String str2) throws IOException, MimeTypeException {
        return create(str, str2, null);
    }

    public static MimeTypes create(String str, String str2, ClassLoader classLoader) throws IOException, MimeTypeException {
        if (classLoader == null) {
            classLoader = MimeTypesReader.class.getClassLoader();
        }
        URL resource = classLoader.getResource(OooOo.OooOoo0(MimeTypesReader.class.getPackage().getName().replace('.', '/'), "/") + str);
        ArrayList list = Collections.list(classLoader.getResources(str2));
        ArrayList arrayList = new ArrayList();
        arrayList.add(resource);
        arrayList.addAll(list);
        OooO0O0 oooO0O0 = LOG;
        if (oooO0O0.OooO0O0()) {
            arrayList.stream().forEach(new OooO00o(0));
        }
        String property = System.getProperty(CUSTOM_MIMES_SYS_PROP);
        if (property != null) {
            File file = new File(property);
            if (file.exists()) {
                arrayList.add(file.toURI().toURL());
                if (oooO0O0.OooO0O0()) {
                    oooO0O0.OooOoO(file.getAbsolutePath(), "Loaded external custom mimetypes file: {}");
                }
            } else {
                throw new IOException("Specified custom mimetypes file not found: ".concat(property));
            }
        }
        return create((URL[]) arrayList.toArray(new URL[0]));
    }
}
