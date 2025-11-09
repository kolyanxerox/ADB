package com.google.android.gms.common.api.internal;

import OooOooo.o000O00O;
import OoooOOO.C0001o0;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* loaded from: classes2.dex */
public final class o0OOO0o extends o00Oo0 {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Oooooo.o0OOO0o f16742OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final TaskCompletionSource f16743OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final C0001o0 f16744OooO0Oo;

    public o0OOO0o(int i, Oooooo.o0OOO0o o0ooo0o, TaskCompletionSource taskCompletionSource, C0001o0 c0001o0) {
        super(i);
        this.f16743OooO0OO = taskCompletionSource;
        this.f16742OooO0O0 = o0ooo0o;
        this.f16744OooO0Oo = c0001o0;
        if (i == 2 && o0ooo0o.f15084OooO00o) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.o00Oo0
    public final boolean OooO00o(Oooo0 oooo0) {
        return this.f16742OooO0O0.f15084OooO00o;
    }

    @Override // com.google.android.gms.common.api.internal.o00Oo0
    public final o000O00O[] OooO0O0(Oooo0 oooo0) {
        return (o000O00O[]) this.f16742OooO0O0.f15086OooO0OO;
    }

    @Override // com.google.android.gms.common.api.internal.o00Oo0
    public final void OooO0OO(Status status) {
        this.f16744OooO0Oo.getClass();
        this.f16743OooO0OO.trySetException(status.OooO() ? new Oooo000.OooOOOO(status) : new Oooo000.OooO0o(status));
    }

    @Override // com.google.android.gms.common.api.internal.o00Oo0
    public final void OooO0Oo(RuntimeException runtimeException) {
        this.f16743OooO0OO.trySetException(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.o00Oo0
    public final void OooO0o(OooO0oO.OooOOO0 oooOOO0, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Map map = (Map) oooOOO0.f13278OooOo;
        TaskCompletionSource taskCompletionSource = this.f16743OooO0OO;
        map.put(taskCompletionSource, boolValueOf);
        taskCompletionSource.getTask().addOnCompleteListener(new OooO0oO.OooOOO0(18, oooOOO0, taskCompletionSource));
    }

    @Override // com.google.android.gms.common.api.internal.o00Oo0
    public final void OooO0o0(Oooo0 oooo0) throws DeadObjectException {
        TaskCompletionSource taskCompletionSource = this.f16743OooO0OO;
        try {
            Oooooo.o0OOO0o o0ooo0o = this.f16742OooO0O0;
            ((OooOOOO) ((Oooooo.o0OOO0o) o0ooo0o.f15087OooO0Oo).f15086OooO0OO).accept(oooo0.f16715OooOo0o, taskCompletionSource);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            OooO0OO(o00Oo0.OooO0oO(e2));
        } catch (RuntimeException e3) {
            taskCompletionSource.trySetException(e3);
        }
    }
}
