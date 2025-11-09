package o000OooO;

import com.google.android.gms.common.api.internal.OooO0O0;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class o0Oo0oo implements OooO0O0 {

    /* renamed from: OooO00o */
    public static final AtomicReference f30568OooO00o = new AtomicReference();

    @Override // com.google.android.gms.common.api.internal.OooO0O0
    public final void OooO00o(boolean z) {
        Random random = o0OO00O.f30556OooOO0;
        synchronized (o0OO00O.class) {
            Iterator it = o0OO00O.f30557OooOO0O.values().iterator();
            while (it.hasNext()) {
                ((o00O0O) it.next()).OooO0Oo(z);
            }
        }
    }
}
