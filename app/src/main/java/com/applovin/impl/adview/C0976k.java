package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.applovin.impl.C0983b2;

/* renamed from: com.applovin.impl.adview.k */
/* loaded from: classes.dex */
public class C0976k extends View {

    /* renamed from: a */
    private final C0983b2 f321a;

    /* renamed from: b */
    private boolean f322b;

    /* renamed from: com.applovin.impl.adview.k$a */
    public interface a {
        /* renamed from: a */
        void mo237a();

        void onFailure();
    }

    public C0976k(C0983b2 c0983b2, Context context) {
        super(context);
        this.f321a = c0983b2;
        setClickable(false);
        setFocusable(false);
    }

    /* renamed from: a */
    public boolean m295a() {
        return this.f322b;
    }

    /* renamed from: b */
    public void m296b() {
        m294a(null);
    }

    public String getIdentifier() {
        return this.f321a.m331b();
    }

    /* renamed from: a */
    public void m294a(a aVar) {
        if (this.f322b) {
            if (aVar != null) {
                aVar.mo237a();
                return;
            }
            return;
        }
        Drawable drawableM330a = this.f321a.m330a();
        if (drawableM330a == null) {
            if (aVar != null) {
                aVar.onFailure();
            }
        } else {
            setBackground(drawableM330a);
            this.f322b = true;
            if (aVar != null) {
                aVar.mo237a();
            }
        }
    }
}
