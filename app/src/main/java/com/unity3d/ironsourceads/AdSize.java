package com.unity3d.ironsourceads;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.ironsource.mediationsdk.C3395l;
import kotlin.jvm.internal.OooOO0O;

/* loaded from: classes3.dex */
public final class AdSize {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final int f13061a;

    /* renamed from: b */
    private final int f13062b;

    /* renamed from: c */
    private final String f13063c;

    public static final class Companion {
        private Companion() {
        }

        public final AdSize banner() {
            return new AdSize(320, 50, C3395l.f9866a, null);
        }

        public final AdSize large() {
            return new AdSize(320, 90, C3395l.f9867b, null);
        }

        public final AdSize leaderboard() {
            return new AdSize(728, 90, C3395l.f9869d, null);
        }

        public final AdSize mediumRectangle() {
            return new AdSize(300, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, C3395l.f9872g, null);
        }

        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }
    }

    private AdSize(int i, int i2, String str) {
        this.f13061a = i;
        this.f13062b = i2;
        this.f13063c = str;
    }

    public static final AdSize banner() {
        return Companion.banner();
    }

    public static final AdSize large() {
        return Companion.large();
    }

    public static final AdSize leaderboard() {
        return Companion.leaderboard();
    }

    public static final AdSize mediumRectangle() {
        return Companion.mediumRectangle();
    }

    public final int getHeight() {
        return this.f13062b;
    }

    public final String getSizeDescription() {
        return this.f13063c;
    }

    public final int getWidth() {
        return this.f13061a;
    }

    public /* synthetic */ AdSize(int i, int i2, String str, OooOO0O oooOO0O) {
        this(i, i2, str);
    }
}
