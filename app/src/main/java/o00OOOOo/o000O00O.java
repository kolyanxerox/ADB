package o00OOOoO;

import OoooOOO.o0O00000;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import kotlin.jvm.internal.OooOo;
import o000oo00.Oooo000;

/* loaded from: classes3.dex */
public final class o000O00O extends o000O00 {
    public static Long OooO(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long lValueOf = Long.valueOf(millis);
        if (millis != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // o00OOOoO.o000O00, o00OOOoO.o0000O
    public final void OooO00o(o000O0Oo o000o0oo2, o000O0Oo target) throws IOException {
        OooOo.OooO0o0(target, "target");
        try {
            Files.move(o000o0oo2.OooO0o(), target.OooO0o(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // o00OOOoO.o000O00, o00OOOoO.o0000O
    public final Oooo000 OooO0o0(o000O0Oo path) throws IOException {
        OooOo.OooO0o0(path, "path");
        Path pathOooO0o = path.OooO0o();
        try {
            BasicFileAttributes attributes = Files.readAttributes(pathOooO0o, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(pathOooO0o) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            if (symbolicLink != null) {
                String str = o000O0Oo.f32579OooOo0o;
                o0O00000.OooO(symbolicLink.toString(), false);
            }
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lOooO = fileTimeCreationTime != null ? OooO(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lOooO2 = fileTimeLastModifiedTime != null ? OooO(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new Oooo000(zIsRegularFile, zIsDirectory, lValueOf, lOooO, lOooO2, fileTimeLastAccessTime != null ? OooO(fileTimeLastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // o00OOOoO.o000O00
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
