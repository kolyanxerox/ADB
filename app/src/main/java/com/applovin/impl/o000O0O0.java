package com.applovin.impl;

import java.io.File;
import java.util.Comparator;
import o000O00.o00O0;
import org.apache.tika.language.detect.LanguageDetector;
import org.apache.tika.language.translate.Translator;
import org.apache.tika.utils.CompareUtils;

/* loaded from: classes.dex */
public final /* synthetic */ class o000O0O0 implements Comparator {

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f15753OooOo0O;

    public /* synthetic */ o000O0O0(int i) {
        this.f15753OooOo0O = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f15753OooOo0O) {
            case 0:
                return C1298y7.m3804a((C1307z7) obj, (C1307z7) obj2);
            case 1:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 2:
                String name = ((File) obj).getName();
                int i = o000O0Oo.OooO0O0.f30127OooO0o;
                return name.substring(0, i).compareTo(((File) obj2).getName().substring(0, i));
            case 3:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 4:
                return ((o000O00.o00000O0) ((o00O0) obj)).f29866OooO00o.compareTo(((o000O00.o00000O0) ((o00O0) obj2)).f29866OooO00o);
            case 5:
                return CompareUtils.compareClassName((Translator) obj, (Translator) obj2);
            case 6:
                return CompareUtils.compareClassName((LanguageDetector) obj, (LanguageDetector) obj2);
            default:
                return CompareUtils.compareClassName(obj, obj2);
        }
    }
}
