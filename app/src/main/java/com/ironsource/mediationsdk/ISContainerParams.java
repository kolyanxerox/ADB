package com.ironsource.mediationsdk;

import OooO0oO.OooOo;

/* loaded from: classes2.dex */
public final class ISContainerParams {

    /* renamed from: a */
    private final int f9526a;

    /* renamed from: b */
    private final int f9527b;

    public ISContainerParams(int i, int i2) {
        this.f9526a = i;
        this.f9527b = i2;
    }

    public static /* synthetic */ ISContainerParams copy$default(ISContainerParams iSContainerParams, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = iSContainerParams.f9526a;
        }
        if ((i3 & 2) != 0) {
            i2 = iSContainerParams.f9527b;
        }
        return iSContainerParams.copy(i, i2);
    }

    public final int component1() {
        return this.f9526a;
    }

    public final int component2() {
        return this.f9527b;
    }

    public final ISContainerParams copy(int i, int i2) {
        return new ISContainerParams(i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ISContainerParams)) {
            return false;
        }
        ISContainerParams iSContainerParams = (ISContainerParams) obj;
        return this.f9526a == iSContainerParams.f9526a && this.f9527b == iSContainerParams.f9527b;
    }

    public final int getHeight() {
        return this.f9527b;
    }

    public final int getWidth() {
        return this.f9526a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f9527b) + (Integer.hashCode(this.f9526a) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ISContainerParams(width=");
        sb.append(this.f9526a);
        sb.append(", height=");
        return OooOo.OooOOO0(sb, this.f9527b, ')');
    }
}
