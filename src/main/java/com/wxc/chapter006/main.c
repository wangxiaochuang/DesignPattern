#include "stdio.h"
#include "stdlib.h"
#include "string.h"

struct User {
    char name[64];
    int age;
    char gender[16];
};
struct User parse_to_user(char *text) {
    struct User user;
    const char split[2] = "&";
    char *p;
    p = strtok(text, split);

    while (p != NULL) {
        printf("%s\n", p);
        p = strtok(NULL, split);
    }
    return user;
}

char *format_to_text(struct User user) {
    return NULL;
}

void sort_users_by_age(struct User users[]) {

}

void format_user_file(char *orgin_file_path, char *new_file_path) {
    struct User users[1024];
    int count = 0;
    while (1) {
        struct User user = parse_to_user(line);
        users[count++] = user;
    }
    sort_users_by_age(users);
    for (int i = 0; i < count; ++i) {
        char *formatted_user_text = format_to_text(users[i]);
        // write to new file
    }
}

int main(int argc, char **argv) {
    char str[1024] = "wxc&16&male";
    parse_to_user(str);
    return 0;
}