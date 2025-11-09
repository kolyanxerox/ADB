package o000OOoO;

import android.content.Context;
import androidx.core.os.UserManagerCompat;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;
import o0000o0.OooOOOO;
import o0000oo0.o000000O;

/* loaded from: classes2.dex */
public final class OooO0o implements OooOO0, OooOO0O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o000000O f30293OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Context f30294OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final o000Oo00.OooOOO f30295OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final Set f30296OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final Executor f30297OooO0o0;

    public OooO0o(Context context, String str, Set set, o000Oo00.OooOOO oooOOO, Executor executor) {
        this.f30293OooO00o = new o000000O(new OooOOOO(context, str));
        this.f30296OooO0Oo = set;
        this.f30297OooO0o0 = executor;
        this.f30295OooO0OO = oooOOO;
        this.f30294OooO0O0 = context;
    }

    public final Task OooO00o() {
        if (!UserManagerCompat.isUserUnlocked(this.f30294OooO0O0)) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.f30297OooO0o0, new OooO0OO(this, 0));
    }

    public final void OooO0O0() {
        if (this.f30296OooO0Oo.size() <= 0) {
            Tasks.forResult(null);
        } else if (!UserManagerCompat.isUserUnlocked(this.f30294OooO0O0)) {
            Tasks.forResult(null);
        } else {
            Tasks.call(this.f30297OooO0o0, new OooO0OO(this, 1));
        }
    }
}
