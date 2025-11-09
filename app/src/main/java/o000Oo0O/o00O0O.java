package o000Oo0O;

import com.google.android.gms.tasks.TaskCompletionSource;
import o000Oo0o.o0ooOOo;

/* loaded from: classes2.dex */
public final class o00O0O implements o00Ooo {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final TaskCompletionSource f30385OooO00o;

    public o00O0O(TaskCompletionSource taskCompletionSource) {
        this.f30385OooO00o = taskCompletionSource;
    }

    @Override // o000Oo0O.o00Ooo
    public final boolean OooO00o(o0ooOOo o0ooooo) {
        int i = o0ooooo.f30407OooO0O0;
        if (i != 3 && i != 4 && i != 5) {
            return false;
        }
        this.f30385OooO00o.trySetResult(o0ooooo.f30406OooO00o);
        return true;
    }

    @Override // o000Oo0O.o00Ooo
    public final boolean OooO0O0(Exception exc) {
        return false;
    }
}
