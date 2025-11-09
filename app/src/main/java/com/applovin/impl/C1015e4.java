package com.applovin.impl;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* renamed from: com.applovin.impl.e4 */
/* loaded from: classes.dex */
public class C1015e4 {

    /* renamed from: a */
    private final View f718a;

    /* renamed from: b */
    private final FriendlyObstructionPurpose f719b;

    /* renamed from: c */
    private final String f720c;

    public C1015e4(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f718a = view;
        this.f719b = friendlyObstructionPurpose;
        this.f720c = str;
    }

    /* renamed from: a */
    public String m689a() {
        return this.f720c;
    }

    /* renamed from: b */
    public FriendlyObstructionPurpose m690b() {
        return this.f719b;
    }

    /* renamed from: c */
    public View m691c() {
        return this.f718a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C1015e4 c1015e4 = (C1015e4) obj;
            View view = this.f718a;
            if (view == null ? c1015e4.f718a != null : !view.equals(c1015e4.f718a)) {
                return false;
            }
            if (this.f719b != c1015e4.f719b) {
                return false;
            }
            String str = this.f720c;
            String str2 = c1015e4.f720c;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        View view = this.f718a;
        int iHashCode = (view != null ? view.hashCode() : 0) * 31;
        FriendlyObstructionPurpose friendlyObstructionPurpose = this.f719b;
        int iHashCode2 = (iHashCode + (friendlyObstructionPurpose != null ? friendlyObstructionPurpose.hashCode() : 0)) * 31;
        String str = this.f720c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
