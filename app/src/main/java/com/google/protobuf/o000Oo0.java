package com.google.protobuf;

/* loaded from: classes2.dex */
public final class o000Oo0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final MessageLite f28224OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f28225OooO0O0;

    public o000Oo0(int i, MessageLite messageLite) {
        this.f28224OooO00o = messageLite;
        this.f28225OooO0O0 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o000Oo0)) {
            return false;
        }
        o000Oo0 o000oo02 = (o000Oo0) obj;
        return this.f28224OooO00o == o000oo02.f28224OooO00o && this.f28225OooO0O0 == o000oo02.f28225OooO0O0;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f28224OooO00o) * 65535) + this.f28225OooO0O0;
    }
}
