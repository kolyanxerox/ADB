package androidx.datastore.core.okio;

import OoooOOO.o0O00000;
import kotlin.jvm.internal.Oooo000;
import o00O0Oo.OooO0O0;
import o00OOOoO.o000O0Oo;
import o00OOoo.Oooo0;

/* loaded from: classes.dex */
public final class OkioStorage$canonicalPath$2 extends Oooo000 implements OooO0O0 {
    final /* synthetic */ OkioStorage<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkioStorage$canonicalPath$2(OkioStorage<T> okioStorage) {
        super(0);
        this.this$0 = okioStorage;
    }

    @Override // o00O0Oo.OooO0O0
    public final o000O0Oo invoke() {
        o000O0Oo o000o0oo2 = (o000O0Oo) ((OkioStorage) this.this$0).producePath.invoke();
        o000o0oo2.getClass();
        boolean z = Oooo0.OooO00o(o000o0oo2) != -1;
        OkioStorage<T> okioStorage = this.this$0;
        if (z) {
            return o0O00000.OooO(o000o0oo2.f32580OooOo0O.OooOOoo(), true);
        }
        throw new IllegalStateException(("OkioStorage requires absolute paths, but did not get an absolute path from producePath = " + ((OkioStorage) okioStorage).producePath + ", instead got " + o000o0oo2).toString());
    }
}
