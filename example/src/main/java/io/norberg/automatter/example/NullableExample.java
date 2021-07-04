package io.norberg.automatter.example;

import static java.lang.System.out;

import io.norberg.automatter.AutoMatter;
import java.io.IOException;
import javax.annotation.Nullable;

public class NullableExample {

  @AutoMatter
  interface NullableFoobar {
    @Nullable
    String foo();

    int bar();
  }

  public static void main(final String... args) throws IOException {
    NullableFoobar foobar = new NullableFoobarBuilder().foo(null).bar(17).build();

    out.println("bar: " + foobar.bar());
    out.println("foo: " + foobar.foo());
    out.println("foobar: " + foobar);
  }
}
