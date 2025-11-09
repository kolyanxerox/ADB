package com.google.android.gms.common.api.internal;

import OooOooo.o000O00O;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class o0Oo0oo extends o00Oo0 {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final TaskCompletionSource f16745OooO0O0;

    public o0Oo0oo(TaskCompletionSource taskCompletionSource) {
        super(4);
        this.f16745OooO0O0 = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.o00Oo0
    public final boolean OooO00o(Oooo0 oooo0) {
        if (oooo0.f16718OooOoOO.get(null) == null) {
            return false;
        }
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.common.api.internal.o00Oo0
    public final o000O00O[] OooO0O0(Oooo0 oooo0) {
        if (oooo0.f16718OooOoOO.get(null) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.common.api.internal.o00Oo0
    public final void OooO0OO(Status status) {
        this.f16745OooO0O0.trySetException(new Oooo000.OooO0o(status));
    }

    @Override // com.google.android.gms.common.api.internal.o00Oo0
    public final void OooO0Oo(RuntimeException runtimeException) {
        this.f16745OooO0O0.trySetException(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.o00Oo0
    public final void OooO0o0(Oooo0 oooo0) throws DeadObjectException {
        try {
            OooO0oo(oooo0);
        } catch (DeadObjectException e) {
            OooO0OO(o00Oo0.OooO0oO(e));
            throw e;
        } catch (RemoteException e2) {
            OooO0OO(o00Oo0.OooO0oO(e2));
        } catch (RuntimeException e3) {
            this.f16745OooO0O0.trySetException(e3);
        }
    }

    public final void OooO0oo(Oooo0 oooo0) {
        if (oooo0.f16718OooOoOO.remove(null) != null) {
            throw new ClassCastException();
        }
        this.f16745OooO0O0.trySetResult(Boolean.FALSE);
    }

    @Override // com.google.android.gms.common.api.internal.o00Oo0
    public final /* bridge */ /* synthetic */ void OooO0o(OooO0oO.OooOOO0 oooOOO0, boolean z) {
    }
}
