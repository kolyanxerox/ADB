package com.ironsource;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.sdk.utils.Logger;

/* renamed from: com.ironsource.yh */
/* loaded from: classes2.dex */
public final class C3871yh extends FrameLayout {

    /* renamed from: a */
    private final String f12751a;

    /* renamed from: b */
    private a f12752b;

    /* renamed from: com.ironsource.yh$a */
    public interface a {
        /* renamed from: a */
        void mo8164a(C3920zw c3920zw);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3871yh(Context context) {
        super(context);
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        this.f12751a = "ISNNativeAdContainer";
    }

    /* renamed from: a */
    private final C3920zw m13203a() {
        return new C3920zw(getVisibility() == 0, getWindowVisibility() == 0, isShown());
    }

    public final a getListener$mediationsdk_release() {
        return this.f12752b;
    }

    @Override // android.view.View
    public void onVisibilityChanged(View changedView, int i) {
        kotlin.jvm.internal.OooOo.OooO0o0(changedView, "changedView");
        Logger.m12266i(this.f12751a, "onVisibilityChanged: " + i);
        a aVar = this.f12752b;
        if (aVar != null) {
            aVar.mo8164a(m13203a());
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        Logger.m12266i(this.f12751a, "onWindowVisibilityChanged: " + i);
        a aVar = this.f12752b;
        if (aVar != null) {
            aVar.mo8164a(m13203a());
        }
    }

    public final void setListener$mediationsdk_release(a aVar) {
        this.f12752b = aVar;
    }
}
