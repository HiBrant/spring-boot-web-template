drop table if exists t_user;

create table t_user(
    id int primary key auto_increment comment '主键ID',
    login_id varchar(64) not null comment '登录名',
    password varchar(512) not null comment '密码',
    username varchar(64) not null comment '用户名',
    kind tinyint not null default 0 comment '用户类型',
    status tinyint not null default 0 comment '状态',
    createtime datetime not null default CURRENT_TIMESTAMP comment '创建时间',
    updatetime datetime on update CURRENT_TIMESTAMP comment '更新时间',
    unique uk_loginid(login_id)
);