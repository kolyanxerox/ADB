package androidx.datastore.core;

import java.io.InputStream;
import java.io.OutputStream;
import o00O0O0O.OooO0OO;

/* loaded from: classes.dex */
public interface Serializer<T> {
    T getDefaultValue();

    Object readFrom(InputStream inputStream, OooO0OO oooO0OO);

    Object writeTo(T t, OutputStream outputStream, OooO0OO oooO0OO);
}
