package androidx.datastore;

import androidx.datastore.core.Serializer;
import androidx.datastore.core.okio.OkioSerializer;
import kotlin.jvm.internal.OooOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00OOOoO.o0000O00;
import o00OOOoO.o0000oo;

/* loaded from: classes.dex */
public final class OkioSerializerWrapper<T> implements OkioSerializer<T> {
    private final Serializer<T> delegate;

    public OkioSerializerWrapper(Serializer<T> delegate) {
        OooOo.OooO0o0(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // androidx.datastore.core.okio.OkioSerializer
    public T getDefaultValue() {
        return this.delegate.getDefaultValue();
    }

    @Override // androidx.datastore.core.okio.OkioSerializer
    public Object readFrom(o0000oo o0000ooVar, OooO0OO oooO0OO) {
        return this.delegate.readFrom(o0000ooVar.inputStream(), oooO0OO);
    }

    @Override // androidx.datastore.core.okio.OkioSerializer
    public Object writeTo(T t, o0000O00 o0000o00, OooO0OO oooO0OO) {
        Object objWriteTo = this.delegate.writeTo(t, o0000o00.outputStream(), oooO0OO);
        return objWriteTo == OooOo00.f31365OooOo0O ? objWriteTo : oo00o.OooOo.f33195OooO00o;
    }
}
