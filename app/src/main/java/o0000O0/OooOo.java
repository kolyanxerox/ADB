package o0000o0;

import com.google.android.gms.common.api.internal.OooO0O0;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class OooOo implements OooO0O0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final AtomicReference f29584OooO00o = new AtomicReference();

    @Override // com.google.android.gms.common.api.internal.OooO0O0
    public final void OooO00o(boolean z) {
        synchronized (Oooo0.f29586OooOO0O) {
            try {
                ArrayList arrayList = new ArrayList(Oooo0.OooOO0o.values());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    Oooo0 oooo0 = (Oooo0) obj;
                    if (oooo0.f29593OooO0o0.get()) {
                        oooo0.OooOO0O(z);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
