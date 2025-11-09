package androidx.datastore;

import OoooOOO.o0O00000;
import android.content.Context;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.Oooo000;
import o00O0Oo.OooO0O0;
import o00OOOoO.o000O0Oo;

/* loaded from: classes.dex */
public final class DataStoreSingletonDelegate$getValue$1$1 extends Oooo000 implements OooO0O0 {
    final /* synthetic */ Context $applicationContext;
    final /* synthetic */ DataStoreSingletonDelegate<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreSingletonDelegate$getValue$1$1(Context context, DataStoreSingletonDelegate<T> dataStoreSingletonDelegate) {
        super(0);
        this.$applicationContext = context;
        this.this$0 = dataStoreSingletonDelegate;
    }

    @Override // o00O0Oo.OooO0O0
    public final o000O0Oo invoke() {
        String str = o000O0Oo.f32579OooOo0o;
        Context applicationContext = this.$applicationContext;
        OooOo.OooO0Oo(applicationContext, "applicationContext");
        String absolutePath = DataStoreFile.dataStoreFile(applicationContext, ((DataStoreSingletonDelegate) this.this$0).fileName).getAbsolutePath();
        OooOo.OooO0Oo(absolutePath, "applicationContext.dataS…le(fileName).absolutePath");
        return o0O00000.OooO(absolutePath, false);
    }
}
