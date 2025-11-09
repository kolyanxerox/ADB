package com.ironsource;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: com.ironsource.wq */
/* loaded from: classes2.dex */
public final class C3812wq {

    /* renamed from: a */
    public static final a f12525a = new a(null);

    /* renamed from: com.ironsource.wq$a */
    public static final class a {
        private a() {
        }

        /* renamed from: a */
        private static final GradientDrawable m12953a() {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(Color.parseColor("#000000"));
            return gradientDrawable;
        }

        public /* synthetic */ a(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }

        /* renamed from: a */
        private final View m12954a(Context context) {
            TextView textView = new TextView(context);
            textView.setText("i");
            textView.setTypeface(Typeface.DEFAULT_BOLD);
            textView.setTextSize(15.0f);
            textView.setBackground(m12953a());
            textView.setAlpha(0.2f);
            textView.setPadding(21, 0, 21, 0);
            textView.setTextColor(Color.parseColor("#FFFFFF"));
            return textView;
        }

        /* renamed from: a */
        public final View m12955a(Context context, String str, InterfaceC3560qi imageLoader) {
            kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
            kotlin.jvm.internal.OooOo.OooO0o0(imageLoader, "imageLoader");
            if (str == null) {
                return m12954a(context);
            }
            Object objMo11413a = imageLoader.mo11413a(str);
            if (objMo11413a instanceof oo00o.OooOO0O) {
                objMo11413a = null;
            }
            Drawable drawable = (Drawable) objMo11413a;
            if (drawable == null) {
                return m12954a(context);
            }
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(drawable);
            return imageView;
        }
    }
}
