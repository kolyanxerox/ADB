package androidx.datastore.core.okio;

import o00O0O0O.OooO0OO;
import o00OOOoO.o0000O00;
import o00OOOoO.o0000oo;

/* loaded from: classes.dex */
public interface OkioSerializer<T> {
    T getDefaultValue();

    Object readFrom(o0000oo o0000ooVar, OooO0OO oooO0OO);

    Object writeTo(T t, o0000O00 o0000o00, OooO0OO oooO0OO);
}
