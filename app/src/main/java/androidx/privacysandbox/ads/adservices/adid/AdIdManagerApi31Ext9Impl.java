package androidx.privacysandbox.ads.adservices.adid;

import android.content.Context;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public final class AdIdManagerApi31Ext9Impl extends AdIdManagerImplCommon {
    /* JADX WARN: Illegal instructions before constructor call */
    public AdIdManagerApi31Ext9Impl(Context context) {
        OooOo.OooO0o0(context, "context");
        android.adservices.adid.AdIdManager adIdManager = android.adservices.adid.AdIdManager.get(context);
        OooOo.OooO0Oo(adIdManager, "get(context)");
        super(adIdManager);
    }
}
