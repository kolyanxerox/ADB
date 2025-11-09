package o00OoOoO;

import java.nio.file.CopyOption;
import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;

/* loaded from: classes3.dex */
public abstract class o00O0O00 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final OpenOption[] f32700OooO00o;

    static {
        OpenOption[] openOptionArr = new OpenOption[2];
        StandardOpenOption.CREATE;
        StandardOpenOption.TRUNCATE_EXISTING;
        OpenOption[] openOptionArr2 = new OpenOption[2];
        StandardOpenOption.CREATE;
        StandardOpenOption.APPEND;
        CopyOption[] copyOptionArr = new CopyOption[0];
        FileAttribute[] fileAttributeArr = new FileAttribute[0];
        FileVisitOption[] fileVisitOptionArr = new FileVisitOption[0];
        LinkOption[] linkOptionArr = new LinkOption[0];
        LinkOption[] linkOptionArr2 = new LinkOption[1];
        LinkOption.NOFOLLOW_LINKS;
        f32700OooO00o = new OpenOption[0];
        Path[] pathArr = new Path[0];
    }
}
