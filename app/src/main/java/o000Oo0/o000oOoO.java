package o000Oo0;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class o000oOoO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f30363OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public int f30364OooO0O0;

    public o000oOoO() {
        this.f30363OooO00o = new ArrayList();
        this.f30364OooO0O0 = 128;
    }

    public synchronized List OooO00o() {
        return Collections.unmodifiableList(new ArrayList(this.f30363OooO00o));
    }

    public synchronized boolean OooO0O0(List list) {
        this.f30363OooO00o.clear();
        if (list.size() <= this.f30364OooO0O0) {
            return this.f30363OooO00o.addAll(list);
        }
        Log.w("FirebaseCrashlytics", "Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.f30364OooO0O0, null);
        return this.f30363OooO00o.addAll(list.subList(0, this.f30364OooO0O0));
    }

    public o000oOoO(ArrayList arrayList) {
        this.f30364OooO0O0 = 0;
        this.f30363OooO00o = arrayList;
    }
}
