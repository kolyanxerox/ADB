package androidx.lifecycle;

import kotlin.jvm.internal.OooOo;
import o00O0O0O.OooOOO0;
import o00O0oOo.o0000O00;
import o00O0oOo.o000O0O0;
import o00OO000.Oooo0;

/* loaded from: classes.dex */
public final class PausingDispatcher extends o0000O00 {
    public final DispatchQueue dispatchQueue = new DispatchQueue();

    @Override // o00O0oOo.o0000O00
    public void dispatch(OooOOO0 context, Runnable block) {
        OooOo.OooO0o0(context, "context");
        OooOo.OooO0o0(block, "block");
        this.dispatchQueue.dispatchAndEnqueue(context, block);
    }

    @Override // o00O0oOo.o0000O00
    public boolean isDispatchNeeded(OooOOO0 context) {
        OooOo.OooO0o0(context, "context");
        o00OO00o.OooO oooO = o000O0O0.f31514OooO00o;
        if (Oooo0.f31951OooO00o.f31652OooOo.isDispatchNeeded(context)) {
            return true;
        }
        return !this.dispatchQueue.canRun();
    }
}
