import request from '@/utils/request'

export function fetchList(query) {
  return request({
    url: '/student/list',
    method: 'get',
    params: query
  })
}

