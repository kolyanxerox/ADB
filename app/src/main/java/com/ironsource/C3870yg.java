package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;

/* renamed from: com.ironsource.yg */
/* loaded from: classes2.dex */
public final class C3870yg extends Throwable {

    /* renamed from: a */
    private final IronSourceError f12750a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3870yg(IronSourceError error) {
        super(error.getErrorMessage());
        kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
        this.f12750a = error;
    }

    /* renamed from: a */
    public final IronSourceError m13202a() {
        return this.f12750a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C3870yg.class.equals(obj.getClass())) {
            return false;
        }
        C3870yg c3870yg = (C3870yg) obj;
        if (this.f12750a.getErrorCode() != c3870yg.f12750a.getErrorCode()) {
            return false;
        }
        return kotlin.jvm.internal.OooOo.OooO00o(this.f12750a.getErrorMessage(), c3870yg.f12750a.getErrorMessage());
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f12750a.getErrorCode()), this.f12750a.getErrorMessage());
    }
}
