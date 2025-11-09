package com.unity3d.ads.core.data.model;

import androidx.datastore.preferences.protobuf.OooO00o;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class AdDataRefreshToken {
    private final String data;

    private /* synthetic */ AdDataRefreshToken(String str) {
        this.data = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AdDataRefreshToken m13754boximpl(String str) {
        return new AdDataRefreshToken(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m13755constructorimpl(String data) {
        OooOo.OooO0o0(data, "data");
        return data;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m13756equalsimpl(String str, Object obj) {
        return (obj instanceof AdDataRefreshToken) && OooOo.OooO00o(str, ((AdDataRefreshToken) obj).m13760unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m13757equalsimpl0(String str, String str2) {
        return OooOo.OooO00o(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m13758hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m13759toStringimpl(String str) {
        return OooO00o.OooO0o(')', "AdDataRefreshToken(data=", str);
    }

    public boolean equals(Object obj) {
        return m13756equalsimpl(this.data, obj);
    }

    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        return m13758hashCodeimpl(this.data);
    }

    public String toString() {
        return m13759toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m13760unboximpl() {
        return this.data;
    }
}
