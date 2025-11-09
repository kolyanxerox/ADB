package androidx.datastore.preferences;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.Oooo000;
import o00O0Oo.OooO0O0;

/* loaded from: classes.dex */
public final class PreferenceDataStoreSingletonDelegate$getValue$1$1 extends Oooo000 implements OooO0O0 {
    final /* synthetic */ Context $applicationContext;
    final /* synthetic */ PreferenceDataStoreSingletonDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceDataStoreSingletonDelegate$getValue$1$1(Context context, PreferenceDataStoreSingletonDelegate preferenceDataStoreSingletonDelegate) {
        super(0);
        this.$applicationContext = context;
        this.this$0 = preferenceDataStoreSingletonDelegate;
    }

    @Override // o00O0Oo.OooO0O0
    public final File invoke() {
        Context applicationContext = this.$applicationContext;
        OooOo.OooO0Oo(applicationContext, "applicationContext");
        return PreferenceDataStoreFile.preferencesDataStoreFile(applicationContext, this.this$0.name);
    }
}
