package com.google.android.gms.internal.play_billing;

import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class o0OOO0o implements Comparable, Serializable {
    public abstract int OooO00o(o0OOO0o o0ooo0o);

    public abstract void OooO0O0(StringBuilder sb);

    public abstract void OooO0OO(StringBuilder sb);

    public final boolean equals(Object obj) {
        if (!(obj instanceof o0OOO0o)) {
            return false;
        }
        try {
            return OooO00o((o0OOO0o) obj) == 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public abstract int hashCode();
}
